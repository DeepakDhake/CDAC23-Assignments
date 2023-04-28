#!/bin/bash
read -p "Input the  number : " n
sum=0
echo -n "The positive divisor  : "
for (( i=1; i<n; i++ ))
do
  if (( n%i == 0 ))
  then
    sum=$(( sum+i ))
    echo -n "$i "
  fi
done

echo
echo "The sum of the divisor is : $sum"

if (( sum == n ))
then
  echo "So, the number is perfect."
else
  echo "So, the number is not perfect."
fi

