package com.ekyc.service.impl;

import com.ekyc.entity.Test;
import com.ekyc.mapper.TestMapper;
import com.ekyc.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangkai
 * @since 2025-02-21
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
