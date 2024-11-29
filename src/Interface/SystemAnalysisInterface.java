/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.rmi.*;

/**
 *
 * @author DELL
 */
public interface SystemAnalysisInterface extends Remote {

    public DefaultCategoryDataset getCinemaProfitAnalysis(int cinema_id, int year, String[] monthList) throws RemoteException;

    public DefaultCategoryDataset getYearMovieAnalysis(int cinema_id, String[] genreList, int year, String[] monthList) throws RemoteException;

    public DefaultPieDataset getYearMovieAnalysisPieChart(int cinema_id, String[] genreList, int year, String[] monthList) throws RemoteException;

    public DefaultCategoryDataset getMonthGenreMovieAnalysis(int cinema_id, String genreList, int year, String monthList) throws RemoteException;

    public DefaultCategoryDataset getOnlyCinemaAnalysis(int cinema_id, String[] genreList, int year, String[] monthList) throws RemoteException;

    public DefaultCategoryDataset getOnlyExpenseAnalysis(int cinema_id, int year, String[] monthList) throws RemoteException;

}
