-- получаем пользователей, которые хотя бы раз попросили о помощи и помогли кому-то
WITH req_needy AS (
    SELECT
      u.id,
      count(r.id) req_needy_count
    FROM users u
      JOIN request r ON u.id = r.needy_id
    GROUP BY u.id
), req_vol AS (
    SELECT
      u.id,
      count(r.id) req_vol_count
    FROM users u
      JOIN request r ON u.id = r.volunteer_id
    GROUP BY u.id
)
SELECT
  u.name,
  u.surname,
  r_n.req_needy_count,
  r_v.req_vol_count
FROM users u
  JOIN req_needy r_n ON u.id = r_n.id
  JOIN req_vol r_v ON u.id = r_v.id;

-- получаем новых пользователей, которые еще не проявили никакой активности
WITH newbies AS (
    SELECT
      u.id,
      u.name,
      count(r_n.id),
      count(r_v.id),
      count(c.id),
      count(u_c.id),
      count(m_s.id),
      count(m_r.id),
      count(n.id)
    FROM users u
      LEFT JOIN request r_n ON u.id = r_n.needy_id
      LEFT JOIN request r_v ON u.id = r_v.volunteer_id
      LEFT JOIN community c ON u.id = c.founder_id
      LEFT JOIN user_community u_c ON u.id = u_c.user_id
      LEFT JOIN message m_s ON u.id = m_s.sender_id
      LEFT JOIN message m_r ON u.id = m_r.recipient_id
      LEFT JOIN news n ON u.id = n.author_id
    GROUP BY u.id
    HAVING count(r_n.id) = 0 AND
           count(r_v.id) = 0 AND
           count(c.id) = 0 AND
           count(u_c.id) = 0 AND
           count(m_s.id) = 0 AND
           count(m_r.id) = 0 AND
           count(n.id) = 0
)
SELECT newbies.name
FROM newbies;

-- получаем самых общительных пользователей
WITH user_msg AS (
    SELECT
      u.id,
      u.name,
      count(m_s.id) msg_sent,
      count(m_r.id) msg_rec
    FROM users u
      LEFT JOIN message m_s ON u.id = m_s.sender_id
      LEFT JOIN message m_r ON u.id = m_r.recipient_id
    GROUP BY u.id
), user_msg_total AS (
    SELECT
      user_msg.id,
      user_msg.name,
      (user_msg.msg_rec + user_msg.msg_sent) msg_total
    FROM user_msg
)
SELECT
  user_msg_total.id,
  user_msg_total.name
FROM user_msg_total
WHERE user_msg_total.msg_total = (SELECT max(user_msg_total.msg_total)
                                  FROM user_msg_total)


