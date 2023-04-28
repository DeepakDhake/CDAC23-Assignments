#!/bin/bash

read -p "Input the number of terms " num
sum=0

for((i=1;i<=num;i++))
do
	sqr=$((i*i))
	echo -n $sqr" " 
	sum=$((sum + sqr))
done
echo -e "\nThe Sum of square natural numbers upto "$num" terms = " $sum 
