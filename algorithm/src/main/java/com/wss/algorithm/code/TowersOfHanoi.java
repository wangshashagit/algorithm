package com.wss.algorithm.code;

/**
 * @Description 河内之塔
 * @Author wangshasha
 * @Date 2019-11-25 16:56
 * @Version
 * 说明
 * 河内之塔(Towersof Hanoi)是法国人M.Claus(Lucas)于1883年从泰国带至法国的，河内为越战时 北越的首都，即现在的胡志明市;
 * 1883年法国数学家 EdouardLucas曾提及这个故事，据说创世 纪时Benares有一座波罗教塔，是由三支钻石棒(Pag)所支撑，
 * 开始时神在第一根棒上放置64 个由上至下依由小至大排列的金盘(Disc) ，并命令僧侣将所有的金盘从第一根石棒移至第根三 石棒，
 * 且搬运过程中遵守大盘子在小盘子之下的原则，若每日仅搬一个盘子，则当盘子全数搬 运完毕之时，此塔将毁损，而也就是世界末日来临之时。
 *
 *
 * 解法如果柱子标为ABC，要由A搬至C，在只有一个盘子时，就将它直接搬至C，当有两个盘子，就将B当作辅助柱。
 * 如果盘数超过2个，将第三个以下的盘子遮起来，就很简单了，每次处 理两个盘子，
 * 也就是:A->B、A ->C、B->C这三个步骤，而被遮住的部份，其实就是进入程式 的递回处理。
 * 事实上，若有n个盘子，则移动完毕所需之次数为2^n - 1，所以当盘数为64时，
 * 则 所需次数为: 264- 1 = 18446744073709551615为5.05390248594782e+16年，也就是约 5000世纪，
 * 如果对这数字没什幺概念，就假设每秒钟搬一个盘子好了，也要约5850亿年左右。
 */
public class TowersOfHanoi {

    //递归
    public void hanio(int n, char A, char B, char C) {

        if(n == 1) {

            System.out.printf("Move sheet %d from %c to %c\n", n, A, C);

        }

        if(n>1) {

            hanio(n-1, A, C, B);

            System.out.printf("Move sheet %d from %c to %c\n", n, A, C);

            hanio(n-1, B, A, C);

        }

    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

        towersOfHanoi.hanio(3, 'A', 'B', 'C');
    }


}
