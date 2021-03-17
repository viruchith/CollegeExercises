# $1 is the positional argument

if [ -f "$1" -o -d "$1" ] #if file or dir exists

then
        echo "`ls -l $1`"
	echo "`file $1`"
else
	echo "File or Directory does not exist! "
fi
