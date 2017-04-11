@REM ************************************************************************************
@REM Description: run Pingclient
@REM Author: Rui Moreira
@REM Date: 20/02/2005
@REM ************************************************************************************
@REM Script usage: runclient <role> (where role should be: server / client)
@REM call setclientenv
call setenv client

@cd %ABSPATH2CLASSES%
@cls
python -m http.server 8000
@cd %ABSPATH2SRC%\%JAVASCRIPTSPATH%