DROP TABLE user;
DROP TABLE food;
DROP TABLE foodreview;
DROP TABLE lodgment;
DROP TABLE lodgmentreview;
DROP TABLE noticeboard;
DROP TABLE noticetwo;
DROP TABLE review;
DROP TABLE reviewnotice;
DROP TABLE save;
DROP TABLE total;
DROP TABLE tourist;
DROP TABLE touristreview;

CREATE TABLE user(
	id VARCHAR(20) PRIMARY KEY,	-- 아이디    CHAR()  not null
    password VARCHAR(2000),	-- 비밀번호    null
    name VARCHAR(10),	-- 이름         not null
    email VARCHAR(100),	-- 이메일noticetwonoticetwo   
    address VARCHAR(50), -- 주소         
    phone VARCHAR(20),	-- 전화번호         
    nickname VARCHAR(20),	-- 닉네임       
    gender VARCHAR(4), 	-- 성별            // CHAR()
    resident VARCHAR(15),	-- 주민번호      // 주민번호 앞 6자리만 
    auth VARCHAR(20),	-- 관리 등급              
    enabled VARCHAR(2)	-- 회원 탈퇴 여부        
);

CREATE TABLE review(
	reviewnum int NOT NULL PRIMARY KEY AUTO_INCREMENT, -- 리뷰번호
    id VARCHAR(20), 	-- 아이디          not null
    reviewcontent VARCHAR(100),	-- 리뷰내용      
    commencontent VARCHAR(100), -- 댓글내용     
	starpoint int,-- 별점                     
    date DATETIME DEFAULT now(), -- 날짜      
    image VARCHAR(500)	-- 이미지          
);

CREATE TABLE reviewnotice(
	reviewnoticenum int PRIMARY KEY, -- 리뷰댓글 번호       
    id VARCHAR(20),	-- 아이디                  
    reviewnum int, 	-- 리뷰번호                  not null
    noticedate DATETIME,	-- 작성날짜            
    reviewboard VARCHAR(100)	-- 리뷰댓글내용      
);

CREATE TABLE foodreview(
	foodreviewnum int PRIMARY KEY,	-- 식당 리뷰 번호       
    reviewnum int,	-- 리뷰번호                  not null
    registnum int	-- 식당등록번호                 
);

CREATE TABLE food(
	foodcode int PRIMARY KEY,	-- 식당 등록번호        
    open DATETIME DEFAULT now(),	-- 영업시간       
    foodaddress VARCHAR(30),	-- 주소
    foodname VARCHAR(10),	-- 식당명
    foodphone VARCHAR(13),	-- 연락처
    look int	-- 조회수
);

CREATE TABLE touristreview(
	touristreviewnum int PRIMARY KEY,	-- 관광지 리뷰번호  not null
	reviewnum int,	-- 리뷰번호
    registnum int	-- 관광지 등록번호
);

CREATE TABLE tourist(
	touristcode int PRIMARY KEY,	-- 등록번호
	touristname VARCHAR(20),	-- 관광명
    touristaddress VARCHAR(20), -- 주소
    look int -- 조회수
);

CREATE TABLE lodgmentreview(
	lodgmentreviewnum int PRIMARY KEY,	-- 숙소 리뷰번호
	reviewnum int,	-- 리뷰번호
    registnum int	-- 숙소 등록번호
);


CREATE TABLE lodgment(
	lodgmentcode int PRIMARY KEY,	-- 숙소 코드
    lodgmentaddress VARCHAR(20),  -- 주소
    lodgmentname VARCHAR(10), -- 숙소명
	lodgmentroom int,	-- 객실 수
	lodgmentarmy VARCHAR(100), -- 부대시설	
    lodgmentphone VARCHAR(13), -- 연락처
    look int	-- 조회수
);

CREATE TABLE total(
	code VARCHAR(4) PRIMARY KEY,
    foodcode int,	-- 식당 등록번호
    touristcode int,	-- 등록번호
    lodgmentcode int	-- 숙소 코드
);

CREATE TABLE save(
	savenum int PRIMARY KEY,	-- 찜 번호
    id VARCHAR(20),	-- 아이디
    code int	-- 코드
);

CREATE TABLE noticeboard(
	noticeboardnum int PRIMARY KEY, -- 게시판 번호
    date DATETIME,	-- 등록일
    id VARCHAR(20),	-- 아이디
    look int,	-- 조회수
    goodpoint int, -- 좋아요 
    title VARCHAR(10),	-- 제목
    board text(255)	-- 내용
);

CREATE TABLE noticetwo(
	noticetwo int PRIMARY KEY,	-- 게시판 댓글 번호
    date DATETIME,		-- 작성날짜
    noticecontent VARCHAR(100),		-- 댓글 내용
    id VARCHAR(20),		-- 아이디
	noticeboardnum int		-- 게시판번호
);



SELECT * FROM user;
SELECT * FROM review;
SELECT * FROM reviewnotice;
SELECT * FROM foodreview;
SELECT * FROM food;
SELECT * FROM tourist;
SELECT * FROM lodgmentreview;
SELECT * FROM lodgment;
SELECT * FROM total;
SELECT * FROM save;
SELECT * FROM noticeboard;
SELECT * FROM noticetwo;





