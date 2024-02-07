SELECT * FROM kh.member;

INSERT INTO member VALUES('test', 'test1234', '테스트');

SELECT id FROM member WHERE id='test';

CREATE TABLE bank(
       name VARCHAR(20),
       bankname VARCHAR(20),
       balance int
);

INSERT INTO bank VALUES('정대윤', '국민은행', 1000000);
INSERT INTO bank VALUES('신대규', '신한은행', 0);

SELECT * FROM bank;

SELECT * FROM tb_book join tb_publisher USING (pub_no);

SELECT * FROM tb_book;

INSERT INTO tb_book(bk_title, bk_author) VALUES('하룻밤, 300억을 포기한 남자', '최민형');

DELETE FROM tb_book WHERE bk_no=1;

SELECT * FROM tb_member;

INSERT INTO tb_member(member_id, member_pwd, member_name) VALUES('user04', 'pass04', '테스트');

SELECT * 
FROM tb_book 
LEFT join tb_publisher USING (pub_no);

SELECT * FROM tb_book;
SELECT * FROM tb_publisher;

SELECT * FROM tb_rent;

INSERT INTO tb_rent(member_no, bk_no) VALUES(1, 3);

SELECT * FROM tb_rent WHERE member_no=5;

SELECT * FROM tb_rent JOIN tb_book USING(bk_no) WHERE member_no = 4;

SELECT * FROM tb_rent;

DELETE FROM tb_rent WHERE rent_no = 2;

SELECT * FROM tb_member;

UPDATE tb_member SET status = 'Y' WHERE member_no=1;

DROP TABLE publisher;