-- add sequence to existing table
CREATE SEQUENCE community_seq START WITH 3000;
ALTER TABLE community ALTER COLUMN id SET DEFAULT nextval('community_seq');