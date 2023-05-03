#!/bin/bash

alph="A"
ctr=1

read -p "Input the number of Letters (less than 26) in the Pyramid: " n

for (( i=1; i<=n; i++ ))
do
  for (( blk=1; blk<=n-i; blk++ ))
  do
    printf "  "
  done

  for (( j=0; j<=(ctr/2); j++ ))
  do
    printf "%c " "$alph"
    ((alph++))
  done

  ((alph--))

  for (( j=0; j<(ctr/2); j++ ))
  do
    ((alph--))
    printf "%c " "$alph"
  done

  ((ctr+=2))
  alph="A"
  printf "\n"
done

