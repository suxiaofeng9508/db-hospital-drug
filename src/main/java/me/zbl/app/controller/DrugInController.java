/*
 * Copyright 2018 JamesZBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package me.zbl.app.controller;

import me.zbl.app.domain.DrugInDO;
import me.zbl.app.domain.DrugInFormDO;
import me.zbl.app.service.DrugInService;
import me.zbl.common.utils.PageWrapper;
import me.zbl.common.utils.Query;
import me.zbl.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 药品入库
 *
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-07
 */
@Controller
public class DrugInController {

  @Autowired
  private DrugInService service;

  /**
   * 药品入库页面
   */
  @GetMapping("/inventory/drugin")
  public String drugInPage() {
    return "app/inventory/drug-in/drug-in";
  }

  /**
   * 药品入库登记
   */
  @GetMapping("/inventory/add")
  public String drugInAddPage() {
    return "app/inventory/drug-in/add";
  }

  /**
   * 入库记录列表
   *
   * @param params 查询参数
   */
  @ResponseBody
  @GetMapping("/inventory/list")
  public PageWrapper list(@RequestParam Map<String, Object> params) {
    Query query = new Query(params);
    List<DrugInDO> list = service.list(query);
    return new PageWrapper(list, service.count());
  }

  /**
   * 入库记录保存
   *
   * @param params 参数
   */
  @ResponseBody
  @PostMapping("/inventory/drugin/save")
  public R save(DrugInFormDO params) {
    try {
      service.drugInSave(params);
    } catch (Exception e) {
      e.printStackTrace();
      return R.error(1, e.getMessage());
    }
    return R.ok();
  }
}
