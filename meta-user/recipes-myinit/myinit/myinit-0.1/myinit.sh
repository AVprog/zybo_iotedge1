#!/bin/sh
echo "hello from yocto  my run iotedge"
hwclock -s

mkdir /var/run/iotedge
echo "" > /var/run/iotedge/mgmt.sock
echo "" > /var/run/iotedge/workload.sock
chmod 777 /var/run/iotedge/*

iotedged -c /etc/iotedge/config.yaml