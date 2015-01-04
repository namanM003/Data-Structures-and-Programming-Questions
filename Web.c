#include <dirent.h>
#include <errno.h>
#include <stdio.h>
#include <string.h>
#include <fcntl.h>


//void lookup(/*const char *arg*/)
/*{
    DIR *dirp;
    struct dirent *dp;


    if ((dirp = opendir("Hello")) == NULL) {
        perror("couldn't open '.'");
        return;
    }


    do {
       // errno = 0;
        if ((dp = readdir(dirp)) != NULL) {
            /*if (strcmp(dp->d_name, arg) != 0)
                continue;*/


          //  printf("found %s\n", dp->d_name);
            //(void) closedir(dirp);
              //  return;


       //}
   // } while (dp != NULL);


  /*  if (errno != 0)
        perror("error reading directory");
    else
        (void) printf("failed to find %s\n", arg);
    (void) closedir(dirp);
    return;*/
//}


void main(int argc, char *argv[])
{
    if(argc!=3)
        printf("Operation failed\n");
    //for (i = 1; i < argc; i++)
    DIR *dirp;
    struct dirent *dp;
    int fd=open(argv[1],O_RDONLY,0);
    if(fd==-1)
    {
        printf("Error in argv 1\n");
    }
    int r=remove(argv[2]);
    int fo=open(argv[2],O_WRONLY | O_CREAT,0666);
    if(fo==-1)
    {
        printf("error in argv[2]\n");
        //printf("%d\n",fo);
        return;
    }
    int n=0;
    char *buf=(char*)malloc(4096);
    printf("Buffer allocated\n");
    while((n=read(fd,buf,4096))!=0)
    {   
        if(n<0)
            {
                printf("Error in reading \n");
                return;
            }
        int x;
        x=write(fo,buf,n);
        if(x!=n)
            printf("Error in writing :(\n");
    }
    close(fd);
    close(fo);
    n=remove(argv[1]);
    dirp = opendir("Hello");
    if (dirp == NULL) {
        //perror("couldn't open '.'");
        return;
    }


    while((dp=readdir(dirp))!=NULL) {
       // errno = 0;
        //if ((dp = readdir(dirp)) != NULL) {
            /*if (strcmp(dp->d_name, arg) != 0)
                continue;*/


            printf("%s\n", dp->d_name);
            //(void) closedir(dirp);
              //  return;


        }
    } //while (dp != NULL);
        //lookup();
    //return (0);
//}
