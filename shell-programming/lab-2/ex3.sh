#Simple calculator

echo "Enter A: "

read A

echo "Enter B: "

read B

echo "Enter OP: "

read OP

case "$OP" in
	"-") echo "Difference = `expr $A - $B`"

	;;

	"/") echo "Division = `expr $A / $B`"

	;;

	"x") echo "Multiplication = `expr $A \* $B`"

	;;

	*)
	
	echo "Sum = `expr $A + $B`" 
	exit 1
	;;
esac

