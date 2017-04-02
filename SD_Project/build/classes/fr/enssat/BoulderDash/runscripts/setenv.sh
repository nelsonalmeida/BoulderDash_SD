#@REM ************************************************************************************
#@REM Description: run previously all batch files
#@REM Author: Rui S. Moreira
#@REM Date: 20/02/2014
#@REM pwd: /Users/rui/Documents/NetBeansProjects/SD/src/edu/ufp/sd/helloworld
#@REM http://docs.oracle.com/javase/tutorial/rmi/running.html
#@REM ************************************************************************************

#@REM ======================== Use Shell Parameters ========================
#@REM Script usage: setenv <role> (where role should be: server / client)
export SCRIPT_ROLE=$1

#@REM ======================== CHANGE BELOW ACCORDING YOUR PROJECT and PC SETTINGS ========================
#@REM ==== PC STUFF ====
export JDK=/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
export USERNAME=nelsonalmeida

#@REM ==== JAVA NAMING STUFF ====
export JAVAPROJ_NAME=SD_Project
export JAVAPROJ=/Users/${USERNAME}/NetBeansProjects/${JAVAPROJ_NAME}
export PACKAGE=BoulderDash
export SERVICE_PREFIX=BoulderDash
export CLIENT_CLASS_PREFIX=BoulderDash
export SERVER_CLASS_PREFIX=BoulderDash
export CLIENT_CLASS_POSTFIX=Client
export SERVER_CLASS_POSTFIX=Server
export SETUP_CLASS_POSTFIX=Setup
export SERVANT_IMPL_CLASS_POSTFIX=Impl
export SERVANT_ACTIVATABLE_IMPL_CLASS_POSTFIX=ActivatableImpl

#@REM ==== NETWORK STUFF ====
#Tem de se confirmar com o ifconfig o en0
#export REGISTRY_HOST=10.100.94.69
#export REGISTRY_HOST=192.168.1.189
export REGISTRY_HOST=192.168.1.198
export REGISTRY_PORT=1099
export SERVER_RMI_HOST=${REGISTRY_HOST}
export SERVER_RMI_PORT=1098
export SERVER_CODEBASE_HOST=${SERVER_RMI_HOST}
export SERVER_CODEBASE_PORT=8000
export CLIENT_RMI_HOST=${REGISTRY_HOST}
export CLIENT_RMI_PORT=1097
export CLIENT_CODEBASE_HOST=${CLIENT_RMI_HOST}
export CLIENT_CODEBASE_PORT=8000

#@REM ======================== DO NOT CHANGE AFTER THIS POINT ========================
export JAVAPACKAGE=fr.enssat.${PACKAGE}
export JAVAPACKAGEROLE=fr.enssat.${PACKAGE}.${SCRIPT_ROLE}
export JAVAPACKAGEPATH=fr/enssat/${PACKAGE}/${SCRIPT_ROLE}
export JAVASCRIPTSPATH=fr/enssat/${PACKAGE}/runscripts
export JAVASECURITYPATH=fr/enssat/${PACKAGE}/securitypolicies
export SERVICE_NAME=${SERVICE_PREFIX}Service
export SERVICE_URL=rmi://${REGISTRY_HOST}:${REGISTRY_PORT}/${SERVICE_NAME}
export SERVANT_ACTIVATABLE_IMPL_CLASS=${JAVAPACKAGEROLE}.${SERVER_CLASS_PREFIX}${SERVANT_ACTIVATABLE_IMPL_CLASS_POSTFIX}
export SERVANT_PERSISTENT_STATE_FILENAME=${SERVICE_PREFIX}Persistent.State

export PATH=${PATH}:${JDK}/bin

export NETBEANS_CLASSES=build/classes/
export NETBEANS_SRC=src

#java.rmi.server.codebase property defines the location where the client/server provides its classes.
#export CODEBASE=file:///${JAVAPROJ}/${NETBEANS_CLASSES}
export SERVER_CODEBASE=http://${SERVER_CODEBASE_HOST}:${SERVER_CODEBASE_PORT}/${NETBEANS_CLASSES}
export CLIENT_CODEBASE=http://${CLIENT_CODEBASE_HOST}:${CLIENT_CODEBASE_PORT}/${NETBEANS_CLASSES}

#Policy tool editor: /Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/bin/policytool
export SERVER_SECURITY_POLICY=file:///${JAVAPROJ}/${NETBEANS_SRC}/${JAVASECURITYPATH}/serverAllPermition.policy
export CLIENT_SECURITY_POLICY=file:///${JAVAPROJ}/${NETBEANS_SRC}/${JAVASECURITYPATH}/clientAllPermition.policy
export SETUP_SECURITY_POLICY=file:///${JAVAPROJ}/${NETBEANS_SRC}/${JAVASECURITYPATH}/setup.policy
export RMID_SECURITY_POLICY=file:///${JAVAPROJ}/${NETBEANS_SRC}/${JAVASECURITYPATH}/rmid.policy
export GROUP_SECURITY_POLICY=file:///${JAVAPROJ}/${NETBEANS_SRC}/${JAVASECURITYPATH}/group.policy

export MYCLASSES_FOLDER=${JAVAPROJ}/${NETBEANS_CLASSES}
export MYCLASSES_JAR=${JAVAPROJ}/dist/SD.jar

export CLASSPATH=${JAVAPROJ}/${NETBEANS_CLASSES}

export ABSPATH2CLASSES=${JAVAPROJ}/${NETBEANS_CLASSES}
export ABSPATH2SRC=${JAVAPROJ}/${NETBEANS_SRC}