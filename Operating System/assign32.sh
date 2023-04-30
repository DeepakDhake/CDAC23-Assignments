#!/bin/bash

read -p "Enter the Number you want to check is prime or not " num

for((i=2;i<num;i++))
do
	if((num % i == 0))
	then
		flag=1
	fi
done

if((flag==0))
then
	echo $num "is a prime number."
else
	echo $num "is not a prime number."
fi
