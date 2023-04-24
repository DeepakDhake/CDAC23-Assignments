#!/bin/bash
read -p "Input the Value of x :" x
read -p "Input the number of terms : " n

sum=1
t=1

for (( i=1; i<n; i++ ))
do
  d=$(( 2*i*(2*i-1) ))
  t=$(bc -l <<< "-($t*$x*$x)/$d")
  sum=$(bc -l <<< "$sum+$t")
done
printf "\nthe sum = %f\nNumber of terms = %d\nvalue of x = %f\n" "$sum" "$n" "$x"

