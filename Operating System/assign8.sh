#!/bin/bash

read -p "Enter Input " num
sum=0
for ((i=1; i<=$num \* 2; i++))
do
	if(( $i % 2!=0 ))
	then
		echo -n " "$i
		sum=`expr $sum + $i`
	fi
done
echo -e "\nThe sum of odd Numbers upto "$num" terms: " $sum
