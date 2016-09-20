package Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.l.learninglistview.R;

import java.util.List;

import model.News;
import model.PinchImageView;

/**
 * Created by l on 2016/9/20.
 */
public class MylistviewAdapter extends BaseAdapter {
    private List<News> data;
    private Context context;
    public MylistviewAdapter(Context context,List<News> data) {
        this.data = data;
        this.context=context;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=new ViewHolder();
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.listview_item,null);
            viewHolder.imageView=(PinchImageView) convertView.findViewById(R.id.pinchImageView);
            viewHolder.title=(TextView)convertView.findViewById(R.id.title1);
            viewHolder.conten=(TextView)convertView.findViewById(R.id.conten);
            convertView.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        viewHolder.imageView.setImageResource(data.get(position).getImageRes());
        viewHolder.title.setText(data.get(position).getTitle());
        viewHolder.conten.setText(data.get(position).getConten());
        return convertView;
    }

    public class ViewHolder{
       public PinchImageView imageView;
       public TextView title;
        public TextView conten;
    }
}
