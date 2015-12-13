package zhaoq_hero.SelectContactorByEnglishCase.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import zhaoq_hero.SelectContactorByEnglishCase.R;
import zhaoq_hero.SelectContactorByEnglishCase.model.Person;

import java.util.List;

/**
 * Project_name : SelectContactorByEnglishCase
 * Author : zhaoQiang
 * Email : zhaoq_hero@163.com
 * Create_time : 2015/12/12 | 20:11
 */
public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<Person> list;
    private ViewHolder viewHolder;

    public ListViewAdapter(Context context, List<Person> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //是否能被点击：
    @Override
    public boolean isEnabled(int position) {
        // TODO Auto-generated method stub
        if (list.get(position).getName().length() == 1)// 如果是字母索引
            return false;// 表示不能点击
        return super.isEnabled(position);  //可点击
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String item = list.get(position).getName();  //获取当前项   数据  是否是字母：

        viewHolder = new ViewHolder();
        if (item.length() == 1) {  //是字母  使用  索引的填充布局：
            convertView = LayoutInflater.from(context).inflate(R.layout.index,
                    null);
            viewHolder.indexTv = (TextView) convertView
                    .findViewById(R.id.indexTv);
        } else {
            //不是字母   使用   数据的填充方式：
            convertView = LayoutInflater.from(context).inflate(R.layout.item,
                    null);
            viewHolder.itemTv = (TextView) convertView
                    .findViewById(R.id.itemTv);
        }

        //绑定数据
        if (item.length() == 1) {
            viewHolder.indexTv.setText(list.get(position).getName());
        } else {
            viewHolder.itemTv.setText(list.get(position).getName());
        }

        return convertView;
    }

    private class ViewHolder {
        private TextView indexTv;
        private TextView itemTv;
    }

}
