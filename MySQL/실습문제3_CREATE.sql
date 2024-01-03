-- 실습 문제
-- 도서관리 프로그램을 만들기 위한 테이블 만들기

-- 1. 출판사들에 대한 데이터를 담기 위한 출판사 테이블(TB_PUBLISHER) 
--    컬럼 : pub_no(출판사번호) -- 기본 키
--           pub_name(출판사명) -- NOT NULL
--           phone(전화번호)
DROP TABLE tb_publisher;
CREATE TABLE tb_publisher (
    pub_no INT primary KEY,
    pub_name VARCHAR(20) NOT NULL,
    phone INT
);

INSERT INTO tb_publisher VALUES(1, '천그루숲', '010-8748-0784');
INSERT INTO tb_publisher VALUES(2, '골드레빗', '0505-398-0505');
INSERT INTO tb_publisher VALUES(3, '월북', '031-955-3777');

SELECT * FROM tb_publisher;
 
-- 2. 도서들에 대한 데이터를 담기 위한 도서 테이블 (tb_book)
--    컬럼 : bk_no (도서번호) -- 기본 키
--           bk_title (도서명) -- NOT NULL
--           bk_author(저자명) -- NOT NULL
--           bk_price(가격)
--           bk_pub_no(출판사 번호) -- 외래 키(tb_publisher 테이블을 참조하도록)
--    조건 : 이때 참조하고 있는 부모 데이터 삭제 시 자식 데이터도 삭제 되도록 옵션 지정
DROP TABLE tb_book;
CREATE TABLE tb_book(
    bk_no INT primary KEY,
    bk_title VARCHAR(20) NOT NULL,
    bk_author VARCHAR(20) NOT NULL,
    bk_price INT,
    bk_pub_no 
    FOREIGN KEY(bk_pub_no) ON DELETE CASCADE
);
INSERT INTO tb_book VALUES(1, '오늘부터 개발자', '김병욱', 16800, 1);
INSERT INTO tb_book VALUES(2, '요즘 우아한 개발', '김병욱', 24000, 2);
INSERT INTO tb_book VALUES(3, '프로덕트 매니저 원칙', '김병욱', 22000, 2);
INSERT INTO tb_book VALUES(4, '코딩 좀 아는 사람', '김병욱', 17800, 3);
INSERT INTO tb_book VALUES(5, '그렇게 쓰면 아무도 안 읽습니다', '김병욱', 19800, 3);

SELECT * FROM tb_book;

-- 3. 회원에 대한 데이터를 담기 위한 회원 테이블 (tb_member)
--    컬럼 : member_no(회원번호) -- 기본 키
--           member_id(아이디)   -- 중복 금지
--           member_pwd(비밀번호) -- NOT NULL
--           member_name(회원명) -- NOT NULL
--           gender(성별)        -- 'M' 또는 'F'로 입력되도록 제한
--           address(주소)       
--           phone(연락처)       
--           status(탈퇴여부)     -- 기본값 'N' / 'Y' 혹은 'N'만 입력되도록 제약조건
--           enroll_date(가입일)  -- 기본값 현재날짜
DROP TABLE tb_member;
CREATE TABLE tb_member (
     member_no INT primary KEY,
     member_id VARCHAR(20) UNIQUE,  
     member_pwd VARCHAR(20) NOT NULL,
     member_name VARCHAR(20) NOT NULL,
	 gender  CHECK(gender IN ('M', 'F'),    -- 'M' 또는 'F'로 입력되도록 제한
	 address      
     phone       
	 status    -- 기본값 'N' / 'Y' 혹은 'N'만 입력되도록 제약조건
	enroll_date
);

INSERT INTO tb_book VALUES(1, 'user01', 'pass01', '홍길동', 'M', '서울시 강서구', 010-1111-2222, 'N', 2024-01-02);
INSERT INTO tb_book VALUES(2, 'user02', 'pass02', '김말똥', 'M', '서울시 강남구', 010-333-4444, 'N', 2024-01-02);
INSERT INTO tb_book VALUES(3, 'user03', 'pass03', '강길순', 'F', '경기도 광주시', 010-4444-5555, 'N', 2024-01-02);

SELECT * FROM tb_member;

-- 4. 도서를 대여한 회원에 대한 데이터를 담기 위한 대여 목록 테이블(tb_rent)
--    컬럼 : rent_no(대여번호) -- 기본 키
--           rent_mem_no(대여 회원번호) -- 외래 키(tb_member와 참조)
--           rent_book_no(대여 도서번호) -- 외래 키(tb_book와 참조)
--           rent_date(대여일) -- 기본값 현재날짜
--    조건 : 이때 부모 데이터 삭제 시 NULL 값이 되도록 옵션 설정

INSERT INTO tb_rent VALUES(1, 1, 2, default);
INSERT INTO tb_rent VALUES(2, 1, 3, default);
INSERT INTO tb_rent VALUES(3, 2, 1, default);
INSERT INTO tb_rent VALUES(4, 2, 2, default);
INSERT INTO tb_rent VALUES(5, 1, 5, default);

-- 5. 2번 도서를 대여한 회원의 이름, 아이디, 대여일, 반납 예정일(대여일 + 7일)을 조회하시오.

-- 6. 회원번호가 1번인 회원이 대여한 도서들의 도서명, 출판사명, 대여일, 반납예정일을 조회하시오.

