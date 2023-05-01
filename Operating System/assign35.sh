#!/bin/bash

read -p "Input number of terms to display " num

prv=0
pre=1

echo -n $prv" "
echo -n $pre" "
for((i=3;i<=num;i++))
do
	trm=$(($prv + $pre))
	echo -n $trm" "
	prv=$pre
	pre=$trm
done
