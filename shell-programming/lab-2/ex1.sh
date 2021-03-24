# copy first file to second file and display it.
  
echo "File - 1: "
read F1
echo "File-2: "
read F2

if [ -f "$F1" -a -f "$F1" ]

then
        #copy f1 to f2
        `cp $F1 $F2`
else
        echo "Invalid Filename !"
fi
