class merge
{
public static void merge(int []a,int []l,int []r,int left,int right)
{
int i=0,j=0,k=0;
while(i<left&&j<right)
{
if(l[i]<=r[j])
{
a[l++]=l[i++];
}
else
{
a[k++]=r[j++];
}
}
while(i<left)
{
a[k++]=l[i++]
}
while(j>right)
{
[k++]=r[j++];
}
}
public static void mergesort(int []a,int a)
{
if(n<2)
{
return;
}
int mid=n/2;
int []l = new int[mif];
int []l = new int[n_mid];
for(int i=0;i<n;i++)
{
r[i-mid]=a[i];
}
mergesort(l,mid);
mergesort(r,n-mid);
}
public static void  main(String args[])
{
int a[]+{8,7,6,5,4,3,2,1};
mergesort(a,a.length);
for(int i=0;i<a.length;i++)
{
system.out.println(a[i]+" ");
}
}
}