-- Sakila : DVD 대여 및 영화 정보와 관련된 데이터 포함

SELECT * FROM category; -- 영화 카테고리 정보 : category_id
SELECT * FROM rental; -- DVD 대여 정보 : customer_id, inventory_id
SELECT * FROM inventory; -- DVD 대여점에서 관리하는 정보 : inventory_id, film_id
SELECT * FROM customer; -- DVD 대여 고객 정보 : customer_id, address_id, first_name
SELECT * FROM film; -- 영화 정보 : film_id, title, description, release_year, language_id, length, rating 
SELECT * FROM actor; -- 영화 배우 정보 : actor_id, first_name, last_name, last_update

SELECT * FROM film_category; -- film과 category 연결 : film_id, category_id
SELECT * FROM film_actor; -- film과 actor 연결 : film_id, actor_id, last_update

SELECT * FROM address; -- 고객 주소 정보 : address_id, city_id, address, district
SELECT * FROM city; -- city_id, country_id, city, last_update 
SELECT * FROM country; -- country_id, country, last_update  ;

-- 1. customer 테이블에서 first_name이 TRACY인 사람들 조회 
SELECT country, city, address, district, first_name, last_name
FROM customer
JOIN address USING(address_id)	 
JOIN city USING(city_id) 
JOIN country USING(country_id)	
WHERE first_name LIKE 'TRACY';


-- 2. 배우 JULIA MCQUEEN이 찍은 영화 제목 조회 (title 기준 정렬 10개까지)
SELECT first_name, last_name, title
FROM actor    --  film,actor
JOIN film_actor USING (actor_id)
JOIN film USING (film_id)
WHERE first_name LIKE 'juli%'
LIMIT 10;

-- first_name, last_name, title : 필요한 컬럼 
-- actor(actor_id), film(film_id) : 필요한 테이블
SELECT * FROM actor; -- actor_id, first_name, last_name
SELECT * FROM film; -- film_id, title
SELECT * FROM film_actor; -- actor_id, film_id
SELECT first_name, last_name, title
FROM film_actor 
JOIN actor USING (actor_id)
JOin film USING (film_id)
WHERE first_name ='julia' AND last_name = 'mcqueen'  
ORDER BY title	
LIMIT 10;


-- 3. 영화 NOON PAPI에 나오는 배우들의 이름 조회
SELECT first_name, last_name
FROM actor    --  film,actor
JOIN film_actor USING (actor_id)
JOIN film USING (film_id)
WHERE title = 'NOON PAPI';

-- first_name, last_name 필요한 컬럼  
-- actor, film : 필요한 테이블
-- actor, film, film_actor : 필요한 테이블
SELECT first_name, last_name 
FROM film_actor	
JOIN film USING(film_id)	
JOIN actor USING (actor_id)
WHERE title = ' NOON PAPI';

-- 서브쿼리 : 조회에 필요한 테이블은 actor분 ..... 
SELECT first_name, last_name
FROM film_actor 
WHERE film_id IN (
                  SELECT film_id
				  FROM film 
				   WHERE title = 'NOON PAPI');
                                              
SELECT film_id
FROM film 
WHERE title = 'NOON PAPI';

-- 4. 각 카테고리별 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 빌린 DVD 대여 수 조회 
SELECT * FROM category; -- category_id
SELECT * FROM film_category; -- film_id, category_id
SELECT * FROM customer; -- customer_id, customer_id
SELECT * FROM rental; --  rental_id, inventory_id, 
 SELECT * FROM invertory; -- invertory_id, film_id
 
 SELECT name category, count(*) count    -- count 설명 챕터 3.
 FROM rental 
 JOIN inventory USING (inventory_id)	
 JOIN customer USING (customer_id)
 JOIN film_category USING (film_id)
 JOIN category USING (category_id)
 WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org'
 GROUP BY name;
 
 SELECT * 
 FROM rental
 JOIN inventory USING(inventory_id)
 JOIN film_category USING (film_id)
 JOIN category USING (category_id)	
 WHERE customer_id = (SELECT customer_id
					FROM customer 
					WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org')
 GROUP BY name;

-- 5. 이메일이 JOYCE.EDWARDS@sakilacustomer.org인 고객이 가장 최근에 빌린 영화 제목과 영화 내용을 조회 
SELECT * FROM customer; -- customer_id, email 
SELECT * FROM rental; -- rental_id, rental_date, customer_id, inventory_id
SELECT * FROM inventory; -- inventory_id, film_id
SELECT * FROM film; -- film_id, title, description 
 
 SELECT title, description 	
 FROM rental 
 JOIN customer USING (customer_id)
 JOIN inventory USING (inventory_id)
 JOIN film USING (film_id) 
 WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org'
 ORDER BY rental_date DESC
 LIMIT 1;

SELECT max(rental_date)
FROM rental 
JOIN customer USING (customer_id)
WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org';


SELECT * 
FROM rantal 
JOIN inventory USING (inventory_id)
JOIN film USING (film_id)
WHERE rental_date = (
                      SELECT max(rental_date)
					  FROM rental 
                      JOIN customer USING (customer_id)
					  WHERE email = 'JOYCE.EDWARDS@sakilacustomer.org');
			
                      
                      
                      
                      
                      
