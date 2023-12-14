\echo ��� ������
SELECT * FROM jaegers
ORDER BY model_name;

\echo �� ������������ ������
SELECT * FROM jaegers
WHERE status = 'Active'
ORDER BY model_name;

\echo ������ mark-1 � mark-4
SELECT * FROM jaegers
WHERE mark IN (1, 4)
ORDER BY model_name;

\echo ��� ������, ����� mark-1 � mark-4
SELECT *FROM jaegers
WHERE mark NOT IN (1, 4)
ORDER BY mark DESC;

\echo ����� ������ �����
SELECT *FROM jaegers
WHERE launch <= (SELECT MIN(launch)FROM jaegers)
ORDER BY model_name;

\echo ������, ������� ���������� ������ ���� kaiju
SELECT * FROM jaegers
WHERE kaiju_kill >= (SELECT MAX(kaiju_kill)FROM jaegers)
ORDER BY kaiju_kill DESC;

\echo ������� ��� �������
SELECT ROUND(AVG(weight), 3) AS avg_weight FROM jaegers;

\echo ���������� ���������� ������ kaiju �� 1 � �� ������������ �������
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1
WHERE status = 'Active';

SELECT * FROM jaegers
ORDER BY model_name;

\echo �������� ������������ �������
DELETE FROM jaegers
WHERE status = 'Destroyed';

SELECT * FROM jaegers
ORDER BY model_name;