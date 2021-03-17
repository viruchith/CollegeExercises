echo "Enter Directory or File-Name: "

read INPUT



if [ -f "$INPUT" -o -d "$INPUT" ] #if file or dir exists

then
        echo "`ls -l $INPUT`"
	echo "`file $INPUT`"
else
	echo "File or Directory does not exist! "
fi
