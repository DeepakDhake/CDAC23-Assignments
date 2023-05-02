#!/bin/bash

read -p "Enter the Number you want to reverse " num

rev=0
reamainder=0

while(($num>0))
do
	remainder=$((num % 10))
	rev=$((rev * 10 + remainder))
	num=$((num / 10))
done
echo "The reverse number is " $rev
