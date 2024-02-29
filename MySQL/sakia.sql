SELECT * FROM film_text
LIMIT 20, 10;

-- 첫 페이지 일 때(page=1) : LIMIT 0, 10
-- 두 번째 페이지 일 때(page=2) : LIMIT 10, 10
-- 세 번째 페이지 일 때(page=3) : LIMIT 20, 10

SELECT count(*) FROM film_text;