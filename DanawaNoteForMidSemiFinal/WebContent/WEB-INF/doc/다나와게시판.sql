--------------------------회원------------------------------------
DROP TABLE USER_INFO; --회원정보 테이블 삭제
DROP SEQUENCE USER_INFO_USER_NO_SEQ; --회원 번호 시퀀스 삭제
---
CREATE TABLE USER_INFO (
    USER_NO NUMBER NOT NULL,
    USER_ID VARCHAR2(20) NOT NULL,
    USER_PWD VARCHAR2(20) NOT NULL,
    USER_EMAIL VARCHAR2(40) NOT NULL,
    USER_PHONE NUMBER(11) NOT NULL,
    USER_NAME VARCHAR2(50) NOT NULL,
    USER_NICKNAME VARCHAR2(24) NOT NULL,
    USER_CRE_DATE DATE NOT NULL,
    USER_MOD_DATE DATE NOT NULL
);

COMMENT ON TABLE USER_INFO IS '회원정보';

COMMENT ON COLUMN USER_INFO.USER_NO IS '회원번호';
COMMENT ON COLUMN USER_INFO.USER_ID IS '아이디';
COMMENT ON COLUMN USER_INFO.USER_PWD IS '암호';
COMMENT ON COLUMN USER_INFO.USER_EMAIL IS '이메일';
COMMENT ON COLUMN USER_INFO.USER_PHONE IS '전화번호';
COMMENT ON COLUMN USER_INFO.USER_NAME IS '이름';
COMMENT ON COLUMN USER_INFO.USER_NICKNAME IS '닉네임';
COMMENT ON COLUMN USER_INFO.USER_CRE_DATE IS '가입일';
COMMENT ON COLUMN USER_INFO.USER_MOD_DATE IS '마지막암호변경일';

ALTER TABLE USER_INFO
ADD CONSTRAINT USER_INFO_USER_EMAIL_PK PRIMARY KEY(USER_EMAIL);

ALTER TABLE USER_INFO
ADD CONSTRAINT USER_INFO_USER_ID_UK UNIQUE(USER_ID);

CREATE SEQUENCE USER_INFO_USER_NO_SEQ
INCREMENT BY 1
START WITH 1;

INSERT INTO user_info
VALUE(USER_NO, USER_ID, USER_PWD, USER_EMAIL, USER_PHONE, USER_NAME, USER_NICKNAME, USER_CRE_DATE, USER_MOD_DATE)
VALUES(USER_INFO_USER_NO_SEQ.NEXTVAL, 'ID', 'PW', 'test@email.com', '01011112222', 'name', 'nick', SYSDATE, SYSDATE);
--
SELECT *
FROM user_info;

-----------------------------게시판-----------------------------------
DROP TABLE BOARD; -- 테이블 삭제
DROP SEQUENCE BOARD_POST_NO_SEQ; --게시판 번호 시퀀스 삭제
--
CREATE TABLE BOARD (
    USER_EMAIL VARCHAR2(40) NOT NULL,
    POST_NO NUMBER NOT NULL,
    POST_TITLE VARCHAR2(100) NOT NULL,
    POST_WRITER VARCHAR2(50) NOT NULL,
    POST_DATE DATE NOT NULL,
    POST_PWD VARCHAR2(20) NOT NULL,  
    POST_CONTENT VARCHAR2(900) NOT NULL,
    POST_VIEW_NO NUMBER NOT NULL
);

COMMENT ON COLUMN BOARD.USER_EMAIL IS '이메일';
COMMENT ON COLUMN BOARD.POST_NO IS '게시글번호';
COMMENT ON COLUMN BOARD.POST_TITLE IS '제목';
COMMENT ON COLUMN BOARD.POST_WRITER IS '글쓴이';
COMMENT ON COLUMN BOARD.POST_DATE IS '게시날짜';
COMMENT ON COLUMN BOARD.POST_PWD IS '비밀번호';
COMMENT ON COLUMN BOARD.POST_CONTENT IS '내용';
COMMENT ON COLUMN BOARD.POST_VIEW_NO IS '조회수';


ALTER TABLE BOARD
ADD CONSTRAINT BOARD_POST_NO_PK PRIMARY KEY(POST_NO);

ALTER TABLE BOARD
ADD CONSTRAINT BOARD_USER_EMAIL_FK FOREIGN KEY(USER_EMAIL) REFERENCES USER_INFO(USER_EMAIL);

CREATE SEQUENCE BOARD_POST_NO_SEQ
INCREMENT BY 1
START WITH 1;

INSERT INTO BOARD
VALUE(USER_EMAIL, POST_NO, POST_TITLE, POST_WRITER, POST_DATE, POST_PWD, POST_CONTENT, POST_VIEW_NO)
VALUES('test@email.com', BOARD_POST_NO_SEQ.NEXTVAL, 'title'||BOARD_POST_NO_SEQ.NEXTVAL, 'nick', SYSDATE, 'PWD', 'content', 0);
--
SELECT *
FROM board;
commit;

BEGIN
    FOR I IN 1..123
    LOOP
    INSERT INTO BOARD
    VALUE(USER_EMAIL, POST_NO, POST_TITLE, POST_WRITER, POST_DATE, POST_PWD, POST_CONTENT, POST_VIEW_NO)
    VALUES('test@email.com', BOARD_POST_NO_SEQ.NEXTVAL, 'title'||BOARD_POST_NO_SEQ.NEXTVAL, 'nick', SYSDATE, 'PWD', 'content', 0);
    END LOOP;
END;