package com.yey.cleverboy.operate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yey.cleverboy.R;
import com.yey.cleverboy.base.BasePage;

/**
 * @author ���� E-mail: 908716835@qq.com
 * @date ����ʱ�䣺2015-8-2 ����3:04:54
 * @version 1.0
 */
public class SettingPager extends BasePage {

	private View view;
	private TextView titleName;

	public SettingPager(Context context) {
		super(context);
	}

	/**
	 * @Name:initView
	 * @Description: ��ʼ������
	 * @Author: �����ˣ����ߣ�
	 * @Version: V1.00 ���汾�ţ�
	 * @Create Date: 2015-8-2 ����3:05:52 ���������ڣ�
	 * @Parameters: LayoutInflater inflater ���������
	 * @Return: View
	 */
	@Override
	public View initView(LayoutInflater inflater) {
		view = inflater.inflate(R.layout.setting_fragment, null);
		titleName = (TextView) view.findViewById(R.id.titleName);
		titleName.setText("����");
		ImageView ivBack = (ImageView) view.findViewById(R.id.back);
		ivBack.setVisibility(View.GONE);
		return view;
	}

	/**
	 * @Name: initData
	 * @Description: ��ʼ������
	 * @Author: �����ˣ����ߣ�
	 * @Version: V1.00 ���汾�ţ�
	 * @Create Date: 2015-8-2 ����3:05:52 ���������ڣ�
	 * @Parameters: ��
	 * @Return: ��
	 */
	@Override
	public void initData() {

	}

}
