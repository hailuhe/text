package workduoxianshixiangjia;

import java.util.Scanner;

public class Tictoe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int SIZE = in.nextInt();
		int[] [] board = new int[SIZE][SIZE];
		boolean gotResult = false ;
		int numOfX = 0;
		int numOfO = 0;
		if (SIZE>=3&&SIZE<=100){
			
		
		//�������
		for (int i=0; i<board.length; i++)
		{
			for( int j=0; j<board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
//System.out.println(board[2][2]);
		//�����
		for (int i=0; i<SIZE; i++ )
		{  
			numOfX = 0;//����������Ա�֤ÿ�ζ��Ǵ��㿪ʼ
		    numOfO = 0;
			for(int j=0; j<SIZE; j++ )
			{   
				if ( board[i][j] == 1 )
				{
//					System.out.println("i="+i+"j="+j);
//					System.out.println("numOfX="+numOfX+" numOfO="+numOfO);
					numOfX ++;
				
				}
				else
				{
					numOfO ++;
				}
			}
		
			if ( numOfX==SIZE||numOfO==SIZE)
			{
				gotResult =true;
//				System.out.println("ahgn"+numOfX);
				break;
			}
		
		}
	//�����
	if ( !gotResult )
	{
		
		for ( int j=0; j<SIZE; j++ )
		{
			numOfX = 0;
			numOfO = 0;
				for(int i=0; i<SIZE; i++)
				{
					if ( board[i][j] == 1 )
					{
						numOfX ++;
					}
					else 
					{
						numOfO ++;
					}
				}
		
				if ( numOfX==SIZE||numOfO==SIZE)
				{
					gotResult =true;
//					System.out.println("lie"+numOfX);
				    break;
				}
		}			
	}
	//��鷴�Խ���
		if( !gotResult )
		{
			numOfX = 0;
			numOfO = 0;
			for ( int i=0; i<SIZE; i++ )
			{
				if ( board[i][SIZE-i-1] == 1 )
				{
					numOfX ++;
				}
				else 
				{
					numOfO ++;
				}
			}
			if ( numOfX==SIZE||numOfO==SIZE)
			{
				gotResult =true;
//				System.out.println("fan"+numOfX);
			}
		}
		//������Խ���
		if( !gotResult )
		{
			numOfX = 0;
			numOfO = 0;
			for ( int i=0,j=0; i<SIZE; i++ ,j++)
			{
				if ( board[i][j] == 1 )
				{
					numOfX ++;
				}
				else 
				{
					numOfO ++;
				}
			}
			if ( numOfX==SIZE||numOfO==SIZE)
			{
				gotResult =true;
//				System.out.println("zhu"+numOfX);
			}
		}
		
	
	if ( gotResult )
	{
		if ( numOfX == SIZE )
		{
			System.out.println("X");
		}
		else if(numOfO == SIZE)
		{
			System.out.println("O");
		}
		
	}
	else 
	{
		System.out.println("NIL");
	}
}
}
}