import os
import sys

def doargs(args):
    if args[1]=="-h":
        print("Usage: \n compileRun.py -h lists this menu\ncompileRun.py -wR path/to/folder Compile but does not run\ncompileRun.py path/to/folder -R filename Commit, compile and run")
        sys.exit(0)
    elif args[1]=="-wR":
        #Compile but do not run
        #print('wr')
        dircontent=os.listdir(args[2])
        os.system(f"git add -A && git commit -m \"Updated From Script\"")
        os.system("git push")
        #print(dircontent)
        for item in dircontent:
            if item.endswith(".java"):
                print(item)
                os.system(f"javac {args[2]}\\{item}")
        print("Compilation completed successfully")
        input("Press Enter to close...")
        sys.exit(0)
    elif args[2] =='-R':
        #Compile and Run
        #print('r')
        dircontent=os.listdir(args[1])
        os.system(f"git add -A && git commit -m \"Updated From Script\"")
        os.system("git push")
        for item in dircontent:
            if item.endswith(".java"):
                os.system(f"javac {item}")
        print("Compilation completed successfully")
        input("Press Enter to continue..")
        print(f"{args[1]}{args[3]}")
        os.system(f"java {args[1]}{args[3]}")
        input("Press Enter to close...")
    else:
        print("Usage: \n compileRun.py -h lists this menu\ncompileRun.py -wR compile but does not run\ncompileRun.py foldername -R filename Commit, cmompile and run")
        sys.exit(1)
args=sys.argv
os.system("git fetch")
doargs(args)
