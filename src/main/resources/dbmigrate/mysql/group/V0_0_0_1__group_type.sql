
CREATE TABLE GROUP_TYPE(
        ID BIGINT NOT NULL,
        NAME VARCHAR(50),
	TENANT_ID VARCHAR(64),
        CONSTRAINT PK_GROUP_TYPE PRIMARY KEY(ID)
) ENGINE=INNODB CHARSET=UTF8;
