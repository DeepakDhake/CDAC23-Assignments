#!/bin/bash

t=9
sum=0
read -p "Input the number " num
for((i=1;i<=num;i++))
do
	sum=$((sum+t))
	echo " " $t
	t=$((t*10+9))
done
echo -e "\nThe sum of the series = " $sum
