-- 코드를 입력하세요
SELECT a.FLAVOR 
FROM FIRST_HALF as a
join ICECREAM_INFO as b
on a.FLAVOR = b.FLAVOR
where a.TOTAL_ORDER > 3000 AND b.INGREDIENT_TYPE = 'fruit_based'
