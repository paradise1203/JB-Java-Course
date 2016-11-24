-- first table
CREATE TABLE foo (c1 integer, c2 text);
INSERT INTO foo
  SELECT i, md5(random()::text)
  FROM generate_series(1, 1000000) AS i;

-- second table
CREATE TABLE bar (c1 integer, c2 boolean);
INSERT INTO bar SELECT i, i%2=1
                FROM generate_series(1, 500000) AS i;

-- sequence scan
EXPLAIN (ANALYZE) SELECT * FROM foo WHERE c1 < 500;
CREATE UNIQUE INDEX ON foo(c1);
-- index scan
EXPLAIN (ANALYZE) SELECT * FROM foo WHERE c1 < 500;
-- index only scan
EXPLAIN (ANALYZE) SELECT c1 FROM foo WHERE c1 < 500;

-- hash join
EXPLAIN (ANALYZE)
SELECT *
FROM foo LEFT JOIN bar ON foo.c1 = bar.c1;
CREATE UNIQUE INDEX on bar(c1);
-- merge join
EXPLAIN (ANALYZE)
SELECT *
FROM foo LEFT JOIN bar ON foo.c1 = bar.c1;

-- sequence scan
EXPLAIN (ANALYZE)
SELECT *
FROM community WHERE created_at > to_date('2016-11-15', 'yyyy-mm-dd');
CREATE INDEX ON community(created_at);
-- bitmap index scan
EXPLAIN (ANALYZE)
SELECT *
FROM community WHERE created_at > to_date('2016-11-15', 'yyyy-mm-dd');