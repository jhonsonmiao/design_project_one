package sendinfo.design4;

/**
 * 小说类
 *
 * @className: NovelBook
 * @author: mxk
 * @date: 2019/6/26  16:45
 */
public class NovelBook implements Ibook {
        //书籍名称
        private String name;
        //书籍的价格
        private int price;
        //书籍的作者
        private String author;
        //通过构造函数传递书籍数据
        public NovelBook(String _name,int _price,String _author){
            this.name = _name;
            this.price = _price;
            this.author = _author;
        }
        //获得作者是谁
        @Override
        public String getAuthor() {
            return this.author;
        }
        //书籍叫什么名字
        @Override
        public String getName() {
            return this.name;
        }
        //获得书籍的价格
        @Override
        public int getPrice() {
            return this.price;
        }
}
