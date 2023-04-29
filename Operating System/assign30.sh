read -p "Input starting number of range: " stno
read -p "Input ending number of range: " enno

echo -n "Armstrong numbers in given range are: "

for (( num=$stno; num<=$enno; num++ ))
do
    temp=$num
    sum=0

    while [ $temp -ne 0 ]
    do
        r=$((temp % 10))
        temp=$((temp / 10))
        sum=$((sum + r * r * r))
    done

    if [ $sum -eq $num ]
    then
        echo -n "$num "
    fi
done

echo ""

