#To find whether the num is ODD or EVEN

echo "Enter num : "

read NUM


if [ `expr $NUM % 2` == 0 ]

then
	echo "$NUM is an EVEN Number"
else
	echo "$NUM is an ODD Number"
fi

