#!/bin/bash
read -p "Input the number of terms " num

sum=0
t=1
for((i=1;i<=num;i++))
do
	echo -n "$t "
	if((i<num))
	then
		echo -n "+ "
	fi
	sum=$((sum + t))
	t=$((((t*10))+1))
done
echo -e "\nThe Sum is : " $sum
