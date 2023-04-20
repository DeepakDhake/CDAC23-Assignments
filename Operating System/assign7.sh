#!/bin/bash

read -p "Enter Input number starting from 1 to n" num
mult=1
for((i=1; i<=$num; i++))
do
	for((j=1; j<=10; j++))
	do
		mult=`expr $i \* $j`
		echo $j " x " $i " = " $mult 
	done
done
