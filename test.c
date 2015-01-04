#include <stdio.h>
#include <dirent.h>
#include <string.h>
#include <errno.h>
//#include "syscalls.h"
void main(){
	DIR *dirp;
	struct dirent *dp;
	dirp=opendir("Hello");
	if(dirp==NULL){
		printf("Unable to open directory");
		return;
	}
	while((dp=readdir(dirp))!=NULL){
		//dp=readdir(dir);
		//if(dp!=NULL)
			char *arg;//=(char*)dp->d_name;
			//strcpy(dp->d_name,arg);
			//int x=strcmp(dp->d_name, "x");
			printf("%s\n",dp->d_name);

	}//while(dp!=NULL);
	FILE *fp;
	fp=fopen("/home/naman/C/D/x","r");
	printf("Opened successfully\n");
	char n;
	while((n=getc(fp))!=EOF){
		printf("%c",n);
	}
	fclose(fp);
	printf("End of Program\n");

}