@echo off
echo �������������Ժ�...
setlocal EnableDelayedExpansion
set classpath=.;..\*;..\lib\*;..\lib_ext\*
@REM launch echo %classpath%
echo %classpath%
endlocal & set classpath=%classpath%

java -Xms512m -Xmx1024m com.echoman.bootstrap.Bootstrap
echo �����ɹ���
pause
