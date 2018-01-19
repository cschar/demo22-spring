

CREATE TABLE customer2
(
		id    				 BIGSERIAL primary key,
    -- id    				 serial primary key,
    moo        VARCHAR(40) not null,
    foo        DATE
);

CREATE TABLE ci_sessions2 (
  session_id varchar(40) NOT NULL DEFAULT '0',
  ip_address varchar(16) NOT NULL DEFAULT '0',
  user_agent varchar(150) NOT NULL,
  last_activity int4 NOT NULL DEFAULT '0',
  user_data text NOT NULL,
  PRIMARY KEY (session_id)
);
