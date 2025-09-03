class LinearSearch
{
    public static void main(String[] args)
    {
        int arr[]={110,20,30,40,50};
        int target=30;
        boolean found=false;
        for(int i=0;i<5;i++)
        {
            if(arr[i]==target)
            {
                found=true;
                System.out.println("Element found at: "+i);
                break;
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }
}