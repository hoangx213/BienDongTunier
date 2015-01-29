package de.biendong.hoang.biendongtunier;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.biendong.hoang.biendongtunier.models.NewsModel;
import de.biendong.hoang.biendongtunier.models.PicModel;
import de.biendong.hoang.biendongtunier.models.PlayerModel;
import de.biendong.hoang.biendongtunier.models.ResultModel;
import de.biendong.hoang.biendongtunier.models.SponsorModel;
import de.biendong.hoang.biendongtunier.models.TeamInfosModel;
import de.biendong.hoang.biendongtunier.models.TeamModel;

/**
 * Created by hoang on 24.11.14.
 */
public class BienDongTunierApplication extends Application {

    public static final String GROUP_A_KEY = "groupA";
    public static final String GROUP_B_KEY = "groupB";
    public static final String GROUP_C_KEY = "groupC";
    public static final String GROUP_D_KEY = "groupD";
    public static final String QUARTER_FINAL_KEY = "quarterFinal";
    public static final String SEMI_FINAL_KEY = "semiFinal";
    public static final String THIRD_PLACE_KEY = "thirdPlace";
    public static final String FINAL_KEY = "final";
    public static final String TEAM_NAME = "teamName";
    public static final String TEAM_URL = "teamUrl";

     public static final List<String> KEY_RESULT_LIST = new ArrayList<String>(){{
        add(GROUP_A_KEY);
        add(GROUP_B_KEY);
        add(GROUP_C_KEY);
        add(GROUP_D_KEY);
        add(QUARTER_FINAL_KEY);
        add(SEMI_FINAL_KEY);
        add(THIRD_PLACE_KEY);
        add(FINAL_KEY);
        add(TEAM_NAME);
        add(TEAM_URL);
    }};

    public static final List<String> KEY_GROUP_LIST = new ArrayList<String>(){{
        add(GROUP_A_KEY);
        add(GROUP_B_KEY);
        add(GROUP_C_KEY);
        add(GROUP_D_KEY);
    }};

    public List<NewsModel> newsList = new ArrayList<NewsModel>();
    public List<PicModel> picsList = new ArrayList<PicModel>();
    public List<PlayerModel> playersList = new ArrayList<PlayerModel>();
    public Map<String, List<ResultModel>> resultsMap = new HashMap<String, List<ResultModel>>();
    public Map<String, List<TeamModel>> groupsMap = new HashMap<String, List<TeamModel>>();
    public List<SponsorModel> sponsorsList = new ArrayList<SponsorModel>();
    public TeamInfosModel teamInfosModel;
    public List<TeamModel> teamsList = new ArrayList<TeamModel>();
    public List<String> navigationDrawerList = new ArrayList<String>();

    private static BienDongTunierApplication singleton;

    public static BienDongTunierApplication getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        newsList.add(new NewsModel("Lorem Ipsum chỉ đơn giản là một đoạn văn bản giả, được dùng vào việc trình bày và dàn trang phục vụ cho in ấn. Lorem Ipsum đã được sử dụng như một văn bản chuẩn cho ngành công nghiệp in ấn từ những năm 1500, khi một họa sĩ vô danh ghép nhiều đoạn văn bản với nhau để tạo thành một bản mẫu văn bản. Đoạn văn bản này không những đã tồn tại năm thế kỉ, mà khi được áp dụng vào tin học văn phòng, nội dung của nó vẫn không hề bị thay đổi. Nó đã được phổ biến trong những năm 1960 nhờ việc bán những bản giấy Letraset in những đoạn Lorem Ipsum, và gần đây hơn, được sử dụng trong các ứng dụng dàn trang, như Aldus PageMaker.", "20.10.2014"));
        newsList.add(new NewsModel("Trái với quan điểm chung của số đông, Lorem Ipsum không phải chỉ là một đoạn văn bản ngẫu nhiên. Người ta tìm thấy nguồn gốc của nó từ những tác phẩm văn học la-tinh cổ điển xuất hiện từ năm 45 trước Công Nguyên, nghĩa là nó đã có khoảng hơn 2000 tuổi. Một giáo sư của trường Hampden-Sydney College (bang Virginia - Mỹ) quan tâm tới một trong những từ la-tinh khó hiểu nhất, \"consectetur\", trích từ một đoạn của Lorem Ipsum, và đã nghiên cứu tất cả các ứng dụng của từ này trong văn học cổ điển, để từ đó tìm ra nguồn gốc không thể chối cãi của Lorem Ipsum. ", "23.10.2014"));
        newsList.add(new NewsModel("Thật ra, nó được tìm thấy trong các đoạn 1.10.32 và 1.10.33 của \"De Finibus Bonorum et Malorum\" (Đỉnh tối thượng của Cái Tốt và Cái Xấu) viết bởi Cicero vào năm 45 trước Công Nguyên. Cuốn sách này là một luận thuyết đạo lí rất phổ biến trong thời kì Phục Hưng. Dòng đầu tiên của Lorem Ipsum, \"Lorem ipsum dolor sit amet...\" được trích từ một câu trong đoạn thứ 1.10.32.", "27.10.2014"));
        newsList.add(new NewsModel("Trích đoạn chuẩn của Lorem Ipsum được sử dụng từ thế kỉ thứ 16 và được tái bản sau đó cho những người quan tâm đến nó. Đoạn 1.10.32 và 1.10.33 trong cuốn \"De Finibus Bonorum et Malorum\" của Cicero cũng được tái bản lại theo đúng cấu trúc gốc, kèm theo phiên bản tiếng Anh được dịch bởi H. Rackham vào năm 1914.", "06.11.2014"));
        newsList.add(new NewsModel("Chúng ta vẫn biết rằng, làm việc với một đoạn văn bản dễ đọc và rõ nghĩa dễ gây rối trí và cản trở việc tập trung vào yếu tố trình bày văn bản. Lorem Ipsum có ưu điểm hơn so với đoạn văn bản chỉ gồm nội dung kiểu \"Nội dung, nội dung, nội dung\" là nó khiến văn bản giống thật hơn, bình thường hơn. Nhiều phần mềm thiết kế giao diện web và dàn trang ngày nay đã sử dụng Lorem Ipsum làm đoạn văn bản giả, và nếu bạn thử tìm các đoạn \"Lorem ipsum\" trên mạng thì sẽ khám phá ra nhiều trang web hiện vẫn đang trong quá trình xây dựng. Có nhiều phiên bản khác nhau đã xuất hiện, đôi khi do vô tình, nhiều khi do cố ý (xen thêm vào những câu hài hước hay thông tục).", "20.11.2014"));
        newsList.add(new NewsModel("Có rất nhiều biến thể của Lorem Ipsum mà bạn có thể tìm thấy, nhưng đa số được biến đổi bằng cách thêm các yếu tố hài hước, các từ ngẫu nhiên có khi không có vẻ gì là có ý nghĩa. Nếu bạn định sử dụng một đoạn Lorem Ipsum, bạn nên kiểm tra kĩ để chắn chắn là không có gì nhạy cảm được giấu ở giữa đoạn văn bản.", "27.10.2014"));
        newsList.add(new NewsModel("Tất cả các công cụ sản xuất văn bản mẫu Lorem Ipsum đều được làm theo cách lặp đi lặp lại các đoạn chữ cho tới đủ thì thôi, khiến cho lipsum.com trở thành công cụ sản xuất Lorem Ipsum đáng giá nhất trên mạng. Trang web này sử dụng hơn 200 từ la-tinh, kết hợp thuần thục nhiều cấu trúc câu để tạo ra văn bản Lorem Ipsum trông có vẻ thật sự hợp lí. Nhờ thế, văn bản Lorem Ipsum được tạo ra mà không cần một sự lặp lại nào, cũng không cần chèn thêm các từ ngữ hóm hỉnh hay thiếu trật tự.", "29.12.2014"));

        picsList.add(new PicModel("San bong", "20.10.2014", "http://upload.wikimedia.org/wikipedia/commons/f/fa/Santiagobernabeupanorama.jpg", "Day la noi dien ra giai bong da cua chung ta."));
        picsList.add(new PicModel("Cup luu niem", "26.10.2014", "http://diaryofacommunicator.com/wp-content/uploads/2014/06/2014-world-cup.jpg", "Day la hinh anh chiec cup luu niem cho doi bong vo dich giai dau."));
        picsList.add(new PicModel("Giai thuong", "30.10.2014", "http://www.das-beste.info/wp-content/uploads/Geld-verdienen-im-Internet.jpg", "Giai thuong la tien mat."));
        picsList.add(new PicModel("Doi cu vu", "20.11.2014", "http://www.energy940.at/media/image/original/15402.jpg", "Cac co dong vien nong bong den tu St Pauli"));
        picsList.add(new PicModel("Ban nhac", "20.12.2014", "http://www.truyenhinhnghean.vn/Uploads/Images/image/phim/ACM.jpg", "De gop vui cho chuong trinh, ban to chuc moi ban nhac AC&M."));

        playersList.add(new PlayerModel("Dương Hồng Sơn", 1, "http://l.f1.img.vnecdn.net/2010/01/09/hson-350-1262970000.jpg"));
        playersList.add(new PlayerModel("Huỳnh Quang Thanh", 2, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/7.jpg"));
        playersList.add(new PlayerModel("Đỗ Văn Khải", 3, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/10.jpg"));
        playersList.add(new PlayerModel("Vũ Như Thành", 4, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/8.jpg"));
        playersList.add(new PlayerModel("Trần Công Minh", 5, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/11.jpg"));
        playersList.add(new PlayerModel("Nguyễn Vũ Phong", 6, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/84066969.jpg"));
        playersList.add(new PlayerModel("Nguyễn Hồng Sơn", 7, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/3_1.jpg"));
        playersList.add(new PlayerModel("Nguyễn Minh Phương", 8, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/DSC_4895.JPG"));
        playersList.add(new PlayerModel("Lê Tấn Tài", 9, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/5.jpg"));
        playersList.add(new PlayerModel("Lê Công Vinh", 10, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/2.jpg"));
        playersList.add(new PlayerModel("Lê Huỳnh Đức", 11, "http://img.v3.news.zdn.vn/w660/Uploaded/izhmr/2014_11_22/1.jpg"));

        List<ResultModel> resultListe = new ArrayList<ResultModel>();
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultListe.add(new ResultModel("Team A", 2, "Team B", 1));
        resultsMap.put(GROUP_A_KEY, resultListe);
        resultsMap.put(GROUP_B_KEY, resultListe);
        resultsMap.put(GROUP_C_KEY, resultListe);
        resultsMap.put(GROUP_D_KEY, resultListe);

        sponsorsList.add(new SponsorModel("BOK", "http://www.sein.de/uploads/bok.jpg"));
        sponsorsList.add(new SponsorModel("Mai Mai", "http://u.jimdo.com/www53/o/s3bbbac8c6c3779b5/img/i5df63b578d722f54/1333004929/cache/image.jpg"));
        sponsorsList.add(new SponsorModel("Kan Asia", "http://www.kanasia.de/wp-content/uploads/2012/05/logo5.png"));
        sponsorsList.add(new SponsorModel("Hanoi Deli", "http://nhahanghanoi.meximas.com/wp-content/uploads/2014/09/logo-hanoi-deli2.png"));
        sponsorsList.add(new SponsorModel("Schweinske", "http://www.cafe-future.net/news/pics/15933-org.jpg"));

        teamInfosModel = new TeamInfosModel("Bien Dong 1", "Hamburg", 12, 2014, "Ba trau", "Vo dich Hannover\nVo dich Hamburg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        teamsList.add(new TeamModel("Bien Dong 1", ""));
        teamsList.add(new TeamModel("Bien Dong 2", ""));
        teamsList.add(new TeamModel("Cong Giao", ""));
        teamsList.add(new TeamModel("St Pauli", ""));
        teamsList.add(new TeamModel("Berlin", ""));
        teamsList.add(new TeamModel("Hannover", ""));
        teamsList.add(new TeamModel("Bremen", ""));
        teamsList.add(new TeamModel("Kiel", ""));
        teamsList.add(new TeamModel("Essen", ""));
        teamsList.add(new TeamModel("Magdeburg", ""));
        teamsList.add(new TeamModel("Braunschweig", ""));
        teamsList.add(new TeamModel("Dressden", ""));

        navigationDrawerList.add(getResources().getString(R.string.tournamentNews));
        navigationDrawerList.add(getResources().getString(R.string.teams));
        navigationDrawerList.add(getResources().getString(R.string.groups));
        navigationDrawerList.add(getResources().getString(R.string.result));
        navigationDrawerList.add(getResources().getString(R.string.sponsor));
        navigationDrawerList.add(getResources().getString(R.string.imprint));

        List<TeamModel> groupA = new ArrayList<TeamModel>();
        groupA.add(new TeamModel("Bein Dong 1", ""));
        groupA.add(new TeamModel("Berlin", ""));
        groupA.add(new TeamModel("Hannover", ""));
        groupA.add(new TeamModel("Kiel", ""));
        List<TeamModel> groupB = new ArrayList<TeamModel>();
        groupB.add(new TeamModel("Bein Dong 2", ""));
        groupB.add(new TeamModel("Bremen", ""));
        groupB.add(new TeamModel("Dressden", ""));
        groupB.add(new TeamModel("Braunschweig", ""));
        List<TeamModel> groupC = new ArrayList<TeamModel>();
        groupC.add(new TeamModel("Cong Giao", ""));
        groupC.add(new TeamModel("Essen", ""));
        groupC.add(new TeamModel("Magdeburg", ""));
        groupC.add(new TeamModel("Stuttgart", ""));
        List<TeamModel> groupD = new ArrayList<TeamModel>();
        groupD.add(new TeamModel("St Pauli", ""));
        groupD.add(new TeamModel("Frankfurt", ""));
        groupD.add(new TeamModel("Leipzig", ""));
        groupD.add(new TeamModel("München", ""));

        groupsMap.put(GROUP_A_KEY, groupA);
        groupsMap.put(GROUP_B_KEY, groupB);
        groupsMap.put(GROUP_C_KEY, groupC);
        groupsMap.put(GROUP_D_KEY, groupD);

    }

}
