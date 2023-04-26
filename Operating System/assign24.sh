#!/bin/bash
read -p "Input the value of x :" x
read -p "Input number of terms : " n
sum=$x
m=-1
printf "The values of the series: \n"
printf "%d\n" "$x"
for (( i=1; i<n; i++ ))
do
  ctr=$(( 2*i+1 ))
  mm=$(( x**ctr ))
  nn=$(( mm*m ))
  printf "%d\n" "$nn"
  sum=$(( sum+nn ))
  m=$(( m*(-1) ))
done
printf "\nThe sum = %d\n" "$sum"

