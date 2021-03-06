package com.rzspider.project.spider.customspider.mapper;

import java.util.List;

import com.rzspider.project.spider.customspider.domain.CustomspiderBackupcode;

/**
 * 自定义爬虫代码备份 数据层
 * 
 * @author ricozhou
 * @date 2018-08-29
 */
public interface CustomspiderBackupcodeMapper {

	/**
	 * 查询自定义爬虫代码备份信息
	 * 
	 * @param spiderCustomspiderBackupcodeId
	 *            自定义爬虫代码备份ID
	 * @return 自定义爬虫代码备份信息
	 */
	public CustomspiderBackupcode selectCustomspiderBackupcodeById(Integer spiderCustomspiderBackupcodeId);

	/**
	 * 查询自定义爬虫代码备份列表
	 * 
	 * @param customspiderBackupcode
	 *            自定义爬虫代码备份信息
	 * @return 自定义爬虫代码备份集合
	 */
	public List<CustomspiderBackupcode> selectCustomspiderBackupcodeList(CustomspiderBackupcode customspiderBackupcode);

	/**
	 * 新增自定义爬虫代码备份
	 * 
	 * @param customspiderBackupcode
	 *            自定义爬虫代码备份信息
	 * @return 结果
	 */
	public int insertCustomspiderBackupcode(CustomspiderBackupcode customspiderBackupcode);

	/**
	 * 修改自定义爬虫代码备份
	 * 
	 * @param customspiderBackupcode
	 *            自定义爬虫代码备份信息
	 * @return 结果
	 */
	public int updateCustomspiderBackupcode(CustomspiderBackupcode customspiderBackupcode);

	/**
	 * 删除自定义爬虫代码备份
	 * 
	 * @param spiderCustomspiderBackupcodeId
	 *            自定义爬虫代码备份ID
	 * @return 结果
	 */
	public int deleteCustomspiderBackupcodeById(Integer spiderCustomspiderBackupcodeId);

	/**
	 * 批量删除自定义爬虫代码备份
	 * 
	 * @param spiderCustomspiderBackupcodeIds
	 *            需要删除的数据ID
	 * @return 结果
	 */
	public int batchDeleteCustomspiderBackupcode(Integer[] spiderCustomspiderBackupcodeIds);

}