#!/bin/bash


read -p "Enter Number to print pattern " num
spc=$((num+4-1))
for((i=1; i<=num; i++))
do
    for((k=spc;k>=1;k--))
	do
		echo -n " "
    	done
    for((j=1;j<=i;j++))
	do
		echo $i
		echo -e "\n"
	spc=$((spc-1))
	done
done

