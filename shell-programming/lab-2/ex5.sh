# Display corresponding number name

NUM_NAMES=("One" "Two" "Three" "Four" "Five" "Six" "Seven" "eight" "Nine" "Ten")
echo "Enter Num: "

read NUM

if (( NUM>=1 && NUM<=10  ))

then
	echo "$NUM = ${NUM_NAMES[`expr $NUM - 1`]}"
else
	echo "Number must be between 1 and 10 !"
fi

