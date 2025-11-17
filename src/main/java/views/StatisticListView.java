package views;

import controllers.StatisticListController;
import utility.CLIUtil;
import utility.ListUtil;

public class StatisticListView {
    StatisticListController statisticListController;

    public StatisticListView (){
        this.statisticListController = new StatisticListController<>();
    }

    public void render() throws Exception {
        this.menuPrint();
        int looper = (int) CLIUtil.getInt();
        while (looper != 0){
            switch (looper){
                case 1: {
                    System.out.println("Add A Number (Not Negative)");
                    double input = CLIUtil.getDouble();
                    statisticListController.add(CLIUtil.getNumber(input));
                    break;
                }
                case 2: {
                    statisticListController.getAverage();
                    break;
                }
                case 3: {
                    statisticListController.getMax();
                    break;
                }
                case 4: {
                    statisticListController.getMin();
                    break;
                }
                case 5: {
                    statisticListController.getMedian();
                    break;
                }
                case 6: {
                    statisticListController.printList();
                    break;
                }
                case 0: {
                    return;
                }
            }
            this.menuPrint();
            looper =CLIUtil.getInt();
        }
    }

    public void menuPrint(){
        System.out.println("Menu Utama:\n" +
                "1. Tambah Angka\n" +
                "2. Tampilkan Rata-Rata\n" +
                "3. Tampilkan Nilai Maksimum\n" +
                "4. Tampilkan Nilai Minimum\n" +
                "5. Tampilkan Median\n" +
                "6. Tampilkan Daftar (Sorted)\n" +
                "0. Keluar");
    }
}
