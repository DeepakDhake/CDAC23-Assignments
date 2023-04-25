#!/bin/bash
read -p "Input number of rows : " n
for (( i=1; i<=n; i++ ))
do
  if (( i%2 == 0 ))
  then
    p=1
    q=0
  else
    p=0
    q=1
  fi
  for (( j=1; j<=i; j++ ))
  do
    if (( j%2 == 0 ))
    then
      echo -n "$p"
    else
      echo -n "$q"
    fi
  done

  echo ""
done

